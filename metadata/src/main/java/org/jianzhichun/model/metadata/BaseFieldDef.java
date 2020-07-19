package org.jianzhichun.model.metadata;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * @author : zao
 * @date 2020/7/19 16:16
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseField", namespace = BaseModelDef.NAMESPACE)
public abstract class BaseFieldDef {

    @XmlElement(namespace = BaseModelDef.NAMESPACE)
    @XmlJavaTypeAdapter(value = CDataAdapter.class)
    protected String description;
    @XmlAttribute(required = true)
    protected String name;
}
