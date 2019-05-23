USE cursofrontendtarde;
CREATE TABLE users(
	id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(30),
    surname VARCHAR(30),
    birthDate DATE,
    startDate DATE,
    usuario VARCHAR(30),
    pass VARCHAR(30),
    PRIMARY KEY (id)
    );
    
CREATE TABLE messages(
	id INT NOT NULL AUTO_INCREMENT,
    content VARCHAR(200),
    publishDate DATE,
    id_user INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_user) REFERENCES users(id)
    );
    
CREATE TABLE reactions (
    id_messages INT NOT NULL,
    id_users INT NOT NULL,
    reactionType INT,
    PRIMARY KEY (id_messages , id_users),
    FOREIGN KEY (id_messages)
        REFERENCES messages (id),
    FOREIGN KEY (id_users)
        REFERENCES users (id)
);

CREATE TABLE relationships(
	id INT NOT NULL AUTO_INCREMENT,
	id_receive INT NOT NULL,
    id_send INT NOT NULL,
    state INT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_receive) REFERENCES users(id),
    FOREIGN KEY (id_send) REFERENCES users(id)
    );
    
CREATE TABLE eventos(
	id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(30),
    descripcion VARCHAR(100),
    eventDate DATE,
    id_user INT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_user) REFERENCES users(id)
    );
    
CREATE TABLE assists(
	id_user INT NOT NULL,
    id_event INT NOT NULL,
    state INT,
    PRIMARY KEY (id_user,id_event),
    FOREIGN KEY (id_user) REFERENCES users(id),
    FOREIGN KEY (id_event) REFERENCES eventos(id)
    );
    
    