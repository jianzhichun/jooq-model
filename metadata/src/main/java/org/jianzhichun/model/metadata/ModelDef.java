package org.jianzhichun.model.metadata;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author : zao
 * @date 2020/7/19 16:21
 */
@EqualsAndHashCode(callSuper = true)
@Data
@XmlRootElement(name = "Model", namespace = BaseModelDef.NAMESPACE)
@XmlType(name = "Model", namespace = BaseModelDef.NAMESPACE)
public class ModelDef extends BaseModelDef {

    @XmlAttribute(required = true)
    protected String table;
}
