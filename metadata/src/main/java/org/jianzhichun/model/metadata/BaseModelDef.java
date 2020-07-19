package org.jianzhichun.model.metadata;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author : zao
 * @date 2020/7/19 15:26
 */
public class BaseModelDef {

    @XmlAttribute(required = true)
    protected String name, table;
}
