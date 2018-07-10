#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: ligne_commandes
#------------------------------------------------------------

CREATE TABLE ligne_commandes(
        id_lign_com int (11) Auto_increment  NOT NULL ,
        libelle     Varchar (25) ,
        prix        Double ,
        qte         Int ,
        perissable  Varchar (25) ,
        id_commande Int ,
        PRIMARY KEY (id_lign_com )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: commande
#------------------------------------------------------------

CREATE TABLE commande(
        id_commande    int (11) Auto_increment  NOT NULL ,
        date_commande  Datetime ,
        fournisseur    Varchar (25) ,
        id_utilisateur Int ,
        PRIMARY KEY (id_commande )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: utilisateur
#------------------------------------------------------------

CREATE TABLE utilisateur(
        id_utilisateur int (11) Auto_increment  NOT NULL ,
        nom            Varchar (25) ,
        prenom         Varchar (25) ,
        date_naiss     Varchar (25) ,
        sexe           Char (1) ,
        adresse        Varchar (25) ,
        code_postal    Int ,
        telephone      Varchar (25) ,
        mail           Varchar (25) ,
        password       Varchar (25) ,
        id_profil      Int ,
        PRIMARY KEY (id_utilisateur )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Profil
#------------------------------------------------------------

CREATE TABLE Profil(
        id_profil int (11) Auto_increment  NOT NULL ,
        libelle   Varchar (25) ,
        PRIMARY KEY (id_profil )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: livraison
#------------------------------------------------------------

CREATE TABLE livraison(
        id_livraison   int (11) Auto_increment  NOT NULL ,
        date_livraison Date ,
        livre          Varchar (25) ,
        id_commande    Int ,
        id_utilisateur Int ,
        PRIMARY KEY (id_livraison )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: facture
#------------------------------------------------------------

CREATE TABLE facture(
        id_facture     int (11) Auto_increment  NOT NULL ,
        date_facture   Date ,
        paye           Varchar (25) ,
        id_commande    Int ,
        id_utilisateur Int ,
        PRIMARY KEY (id_facture )
)ENGINE=InnoDB;

ALTER TABLE ligne_commandes ADD CONSTRAINT FK_ligne_commandes_id_commande FOREIGN KEY (id_commande) REFERENCES commande(id_commande);
ALTER TABLE commande ADD CONSTRAINT FK_commande_id_utilisateur FOREIGN KEY (id_utilisateur) REFERENCES utilisateur(id_utilisateur);
ALTER TABLE utilisateur ADD CONSTRAINT FK_utilisateur_id_profil FOREIGN KEY (id_profil) REFERENCES Profil(id_profil);
ALTER TABLE livraison ADD CONSTRAINT FK_livraison_id_commande FOREIGN KEY (id_commande) REFERENCES commande(id_commande);
ALTER TABLE livraison ADD CONSTRAINT FK_livraison_id_utilisateur FOREIGN KEY (id_utilisateur) REFERENCES utilisateur(id_utilisateur);
ALTER TABLE facture ADD CONSTRAINT FK_facture_id_commande FOREIGN KEY (id_commande) REFERENCES commande(id_commande);
ALTER TABLE facture ADD CONSTRAINT FK_facture_id_utilisateur FOREIGN KEY (id_utilisateur) REFERENCES utilisateur(id_utilisateur);
