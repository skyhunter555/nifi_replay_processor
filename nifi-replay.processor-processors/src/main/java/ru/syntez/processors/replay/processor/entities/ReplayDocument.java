package ru.syntez.processors.replay.processor.entities;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ReplayDocument model
 *
 * @author Skyhunter
 * @date 10.02.2021
 */
@XmlRootElement(name = "ReplayDocument")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ReplayDocument {
    private int docNumber;
    private String docType;
}
