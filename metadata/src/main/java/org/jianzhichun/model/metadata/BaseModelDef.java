package org.jianzhichun.model.metadata;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

/**
 * @author : zao
 * @date 2020/7/19 15:26
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseModel", namespace = BaseModelDef.NAMESPACE)
public abstract class BaseModelDef {

    public static final String NAMESPACE = "http://jianzhichun.org/model";

    @XmlAttribute(required = true)
    protected String name, id, version;
    @XmlElement(namespace = BaseModelDef.NAMESPACE)
    @XmlJavaTypeAdapter(value = CDataAdapter.class)
    protected String description;
    @XmlElements({
            @XmlElement(type = FieldDef.class, name = "field", namespace = BaseModelDef.NAMESPACE)
    })
    protected List<BaseFieldDef> fields;
}

