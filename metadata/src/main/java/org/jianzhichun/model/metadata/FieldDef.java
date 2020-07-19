package org.jianzhichun.model.metadata;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.jianzhichun.model.metadata.enumeration.FieldType;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * @author : zao
 * @date 2020/7/19 16:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@XmlType(name = "Field", namespace = BaseModelDef.NAMESPACE)
public class FieldDef extends BaseFieldDef {

    @XmlAttribute(required = true)
    protected String column;
    @XmlAttribute(required = true)
    protected FieldType type;
}
