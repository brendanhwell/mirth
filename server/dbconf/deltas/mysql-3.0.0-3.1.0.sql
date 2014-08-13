CREATE TABLE PERSON_PREFERENCES
	(PERSON_ID INTEGER NOT NULL,
	NAME VARCHAR(255) NOT NULL,
	VALUE LONGTEXT,
	CONSTRAINT PERSON_ID_PERSON_PREF_FK FOREIGN KEY(PERSON_ID) REFERENCES PERSON(ID) ON DELETE CASCADE
) ENGINE=InnoDB

CREATE INDEX PERSON_PREFERENCES_INDEX1 ON PERSON_PREFERENCES(PERSON_ID)

ALTER TABLE PERSON ADD COLUMN INDUSTRY VARCHAR(255) DEFAULT NULL

UPDATE SCRIPT SET ID = 'Undeploy' WHERE GROUP_ID = 'Global' AND ID = 'Shutdown'