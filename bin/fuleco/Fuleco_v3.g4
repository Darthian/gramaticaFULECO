/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Fuleco_v3;

SAQUE_INICIAL:              'SAQUE_INICIAL';                 //SAQUE_INICIAL
ABRIR_LLAVE:                '(>_<)';                    //Abrir llave
CERRAR_LLAVE:               '(>.<)';                    //Cerrar llave
BRASILERO:                  'Brasilero';                  //BRASILERO
ALEMAN:			    'Aleman';
JAPON:                      'Japon';                 //JAPON
PARENTESIS_IZQ:             '(';                    //perentesis
PARENTESIS_DER:             ')';                    //perentesis
GAMBETEAR:                  'GAMBETEAR';                //GAMBETEAR
TRUE:                       'GOL';                 //TRUE
FALSE:                      'AUTOGOL';                //FALSE
ARBITRO:                    'ARBITRO';                   //ARBITRO
ENTONCES:                   'PIENSA';                 //Entonces
SOBORNO:                    'SOBORNO';                 //SOBORNO
TIEMPO_ADICIONAL:           'TIEMPO_ADICIONAL';                    // + TIEMPO_ADICIONALR
QUEMAR_TIEMPO:              'QUEMAR_TIEMPO';                    // - SUSTTRAER
LESIONAR:                   'LESIONAR';                    // / LESIONAR     
ANIMAR:                     'ANIMAR';                    // * multiplicacion
CARA:                       'CARA';                    // >
SELLO:                      'SELLO';                    // <
EMPATE:                     'EMPATE';                   //IGUAL
PENALTY:                    'PENALTY';                  //PENALTY ==
DIFERENTE:                   '!=';
MOSTRAR_MARCADOR:                      'MOSTRAR_MARCADOR';                //IMPRIMIR
COMILLAS:                   '"';            
FIN_LINEA:                 '!';                    //FIN DE LINEA
CONCATENAR:                 '+';                   //Concatenar 
RETURN:                       'return';
COMA:                          ',';

WS  :   ( ' ' | '\t' | '\r' | '\n')+ -> skip;

CADENA: COMILLAS (.)*? COMILLAS;                  //ALEMANS
NUMEROS: (DIGITOS)+;                              //NUMEROS
VARIABLE: LETRA(LETRA|DIGITOS)*;
DIGITOS: [0-9];
LETRA: [a-z|A-Z|_];

clase : programa (funcion)* ; 
programa : BRASILERO SAQUE_INICIAL PARENTESIS_IZQ PARENTESIS_DER  ABRIR_LLAVE declaraciones sentencias CERRAR_LLAVE;
funcion : tipo VARIABLE PARENTESIS_IZQ (parametros (COMA parametros)*)? PARENTESIS_DER  ABRIR_LLAVE (declaraciones sentencias)? RETURN expresion FIN_LINEA CERRAR_LLAVE;
parametros: tipo VARIABLE;

declaraciones : (declaracion)+;
declaracion : tipo VARIABLE FIN_LINEA | tipo asign;
tipo : BRASILERO | JAPON | ALEMAN ;
sentencias : (sentencia)+;

sentencia: impr |bloque|asign|comparacion|ciclo | llamarFunc;

llamarFunc : VARIABLE PARENTESIS_IZQ ( primario (COMA primario)*)? PARENTESIS_DER;
impr : MOSTRAR_MARCADOR PARENTESIS_IZQ  (concaten)* PARENTESIS_DER FIN_LINEA;
concaten : CADENA|VARIABLE (CONCATENAR (CADENA|VARIABLE))*;
bloque : ABRIR_LLAVE sentencias CERRAR_LLAVE;

asign : VARIABLE EMPATE expresion FIN_LINEA;
comparacion: ARBITRO PARENTESIS_IZQ expresion PARENTESIS_DER PARENTESIS_IZQ bloque | ARBITRO PARENTESIS_IZQ expresion PARENTESIS_DER bloque SOBORNO bloque;
ciclo : GAMBETEAR PARENTESIS_IZQ expresion PARENTESIS_DER sentencia;
expresion : relacion | relacion opIgu relacion  ;
opIgu : PENALTY | DIFERENTE;
relacion : adicion | adicion opRel adicion;
opRel : CARA | SELLO;
adicion : termino | termino (opSum termino)+;
opSum : TIEMPO_ADICIONAL | QUEMAR_TIEMPO;
termino : primario| primario (opMul primario)+;
opMul : ANIMAR | LESIONAR;
primario : VARIABLE | literal | CADENA | llamarFunc;
literal : entero | booleano;
entero : NUMEROS;
booleano : TRUE | FALSE;