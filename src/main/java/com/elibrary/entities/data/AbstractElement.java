package com.elibrary.entities.data;

import com.elibrary.exception.UnsupportedFormatException;
import com.elibrary.interfaces.ConvertibleFormats;
import com.elibrary.interfaces.IConvertibleToFile;

abstract class AbstractElement implements IConvertibleToFile {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String convertTo(ConvertibleFormats format) {
        String response = null;
        if(format.equals(ConvertibleFormats.JSON)) {
            response = convertToJSON();
        }else if(format.equals(ConvertibleFormats.XML)) {
            response = convertToXML();
        }else if(format.equals(ConvertibleFormats.YAML)) {
            response = convertToYAML();
        } else {
            throw new UnsupportedFormatException("Format " + format.toString() + "is not supported file format!!");
        }
        return response;
    }
}
