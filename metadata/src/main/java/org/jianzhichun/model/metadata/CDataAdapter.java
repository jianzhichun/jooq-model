package org.jianzhichun.model.metadata;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author : zao
 * @date 2020/7/19 15:58
 */
public class CDataAdapter extends XmlAdapter<String, String> {

    private static final String BEGIN = "<![CDATA[", END = "]]>";

    @Override
    public String unmarshal(String v) {
        return BEGIN + v + END;
    }

    @Override
    public String marshal(String v) {
        if (v.startsWith(BEGIN) && v.endsWith(END)) {
            return v.substring(9, v.length() - 3);
        }
        return v;
    }
}
