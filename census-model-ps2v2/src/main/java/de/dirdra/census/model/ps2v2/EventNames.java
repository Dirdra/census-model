//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.04 um 03:33:06 PM CET 
//


package de.dirdra.census.model.ps2v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für eventNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="eventNames"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="AchievementEarned"/&gt;
 *     &lt;enumeration value="BattleRankUp"/&gt;
 *     &lt;enumeration value="Death"/&gt;
 *     &lt;enumeration value="GainExperience"/&gt;
 *     &lt;enumeration value="ItemAdded"/&gt;
 *     &lt;enumeration value="PlayerFacilityCapture"/&gt;
 *     &lt;enumeration value="PlayerFacilityDefend"/&gt;
 *     &lt;enumeration value="SkillAdded"/&gt;
 *     &lt;enumeration value="VehicleDestroy"/&gt;
 *     &lt;enumeration value="ContinentLock"/&gt;
 *     &lt;enumeration value="ContinentUnlock"/&gt;
 *     &lt;enumeration value="FacilityControl"/&gt;
 *     &lt;enumeration value="MetagameEvent"/&gt;
 *     &lt;enumeration value="PlayerLogin"/&gt;
 *     &lt;enumeration value="PlayerLogout"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "eventNames")
@XmlEnum
public enum EventNames {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("AchievementEarned")
    ACHIEVEMENT_EARNED("AchievementEarned"),
    @XmlEnumValue("BattleRankUp")
    BATTLE_RANK_UP("BattleRankUp"),
    @XmlEnumValue("Death")
    DEATH("Death"),
    @XmlEnumValue("GainExperience")
    GAIN_EXPERIENCE("GainExperience"),
    @XmlEnumValue("ItemAdded")
    ITEM_ADDED("ItemAdded"),
    @XmlEnumValue("PlayerFacilityCapture")
    PLAYER_FACILITY_CAPTURE("PlayerFacilityCapture"),
    @XmlEnumValue("PlayerFacilityDefend")
    PLAYER_FACILITY_DEFEND("PlayerFacilityDefend"),
    @XmlEnumValue("SkillAdded")
    SKILL_ADDED("SkillAdded"),
    @XmlEnumValue("VehicleDestroy")
    VEHICLE_DESTROY("VehicleDestroy"),
    @XmlEnumValue("ContinentLock")
    CONTINENT_LOCK("ContinentLock"),
    @XmlEnumValue("ContinentUnlock")
    CONTINENT_UNLOCK("ContinentUnlock"),
    @XmlEnumValue("FacilityControl")
    FACILITY_CONTROL("FacilityControl"),
    @XmlEnumValue("MetagameEvent")
    METAGAME_EVENT("MetagameEvent"),
    @XmlEnumValue("PlayerLogin")
    PLAYER_LOGIN("PlayerLogin"),
    @XmlEnumValue("PlayerLogout")
    PLAYER_LOGOUT("PlayerLogout");
    private final String value;

    EventNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventNames fromValue(String v) {
        for (EventNames c: EventNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
