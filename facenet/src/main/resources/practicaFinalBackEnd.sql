USE cursofrontendtarde;
CREATE TABLE users(
    id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(30),
   surname VARCHAR(30),
   birthdate DATE,
   startdate DATE,
   user VARCHAR(30),
   pass VARCHAR(30),
   PRIMARY KEY (id)
   );

CREATE TABLE messages(
    id INT NOT NULL AUTO_INCREMENT,
   content VARCHAR(200),
   publishdate DATE,
   iduser INT NOT NULL,
   PRIMARY KEY (id),
   FOREIGN KEY (iduser) REFERENCES users(id)
   );

CREATE TABLE reactions (
    id INT NOT NULL AUTO_INCREMENT,
   id_messages INT NOT NULL,
   id_users INT NOT NULL,
   reactionType INT,
   PRIMARY KEY (id),
   FOREIGN KEY (id_messages)
       REFERENCES messages (id),
   FOREIGN KEY (id_users)
       REFERENCES users (id)
);

CREATE TABLE relationships(
    id INT NOT NULL AUTO_INCREMENT,
    idreceive INT NOT NULL,
   idsend INT NOT NULL,
   state INT,
   PRIMARY KEY (id),
   FOREIGN KEY (idreceive) REFERENCES users(id),
   FOREIGN KEY (idsend) REFERENCES users(id)
   );

CREATE TABLE events(
    id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(30),
   description VARCHAR(100),
   eventdate DATE,
   iduser INT,
   PRIMARY KEY (id),
   FOREIGN KEY (iduser) REFERENCES users(id)
   );

CREATE TABLE assists(
    id INT NOT NULL AUTO_INCREMENT,
    iduser INT NOT NULL,
   idevent INT NOT NULL,
   state INT,
   PRIMARY KEY (id),
   FOREIGN KEY (iduser) REFERENCES users(id),
   FOREIGN KEY (idevent) REFERENCES events(id)
   );