create DATABASE banco_clinica


CREATE TABLE PACIENTE (

	 CPF VARCHAR(15),
     NOME VARCHAR (50) NOT NULL,
     RG INT NOT NULL,
     TELEFONE VARCHAR (20) NULL,
     ESTADO VARCHAR(30) NULL,
     CIDADE VARCHAR(40) NULL,
     BAIRRO VARCHAR (40) NULL,
     RUA VARCHAR (40) NULL,
     NUMEROEND INT NULL,
     
     PRIMARY KEY (CPF)
     
);


CREATE TABLE FUNCIONARIO (
	 
     CPF VARCHAR(15),
     NOME VARCHAR (50) NOT NULL,
     RG INT NOT NULL,
     TELEFONE VARCHAR (20) NULL,
     ESTADO VARCHAR(30) NULL,
     CIDADE VARCHAR(40) NULL,
     BAIRRO VARCHAR (40) NULL,
     RUA VARCHAR (40) NULL,
     NUMEROEND INT NULL,
     LOGIN VARCHAR(30) UNIQUE,
     SENHA VARCHAR (30) NULL,
     
     PRIMARY KEY (CPF)
  );
  
  CREATE TABLE AGENDA(
	
    CODIGO INT AUTO_INCREMENT,
    CPFPACIENTE VARCHAR(11),
    CPFFUNCIONARIO VARCHAR(11),
    DATAAGENDAMENTO VARCHAR(10),
	HORA VARCHAR(10),
	
    PRIMARY KEY(CODIGO, CPFPACIENTE,CPFFUNCIONARIO,DATAAGENDAMENTO,HORA),
    FOREIGN KEY (CPFPACIENTE) REFERENCES PACIENTE (CPF),
    FOREIGN KEY (CPFFUNCIONARIO) REFERENCES FUNCIONARIO(CPF)
  );
  
 
  
  CREATE TABLE PRONTUARIO(
	
    CODIGO INT AUTO_INCREMENT,
    CODIGOAGENDA INT,
	PRONTUARIOAGENDA VARCHAR(1000),
    
    PRIMARY KEY (CODIGO, CODIGOAGENDA),
    FOREIGN KEY (CODIGOAGENDA) REFERENCES AGENDA(CODIGO)
  );
  
  
