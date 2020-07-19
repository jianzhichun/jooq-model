package org.jianzhichun.model.metadata.enumeration;

import org.jianzhichun.model.metadata.BaseModelDef;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * @author : zao
 * @date 2020/7/19 16:30
 */
@XmlType(name = "BaseModel", namespace = BaseModelDef.NAMESPACE)
@XmlEnum
public enum FieldType {

    /**
     * field types
     */
    @XmlEnumValue("int")
    INT,
    @XmlEnumValue("decimal")
    DECIMAL,
    @XmlEnumValue("text")
    TEXT,
    @XmlEnumValue("date")
    DATE,
    @XmlEnumValue("json")
    JSON,
    @XmlEnumValue("json-array")
    JSON_ARRAY
}
