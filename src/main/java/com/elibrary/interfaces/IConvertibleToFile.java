package com.elibrary.interfaces;

public interface IConvertibleToFile extends IConvertibleToYAML, IConvertibleToXML, IConvertibleToJSON{

    String convertTo(ConvertibleFormats format);

}
