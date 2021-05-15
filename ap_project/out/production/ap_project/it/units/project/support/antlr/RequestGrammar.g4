
grammar RequestGrammar;

/**
 * Parser rules
 */
parse: command EOF;

command
    : quitRequest
    | statRequest
    | computationRequest;

quitRequest: BYE;

statRequest
    : statReqsCommand
    | statAvgCommand
    | statMaxCommand;

statReqsCommand  : STAT_REQS;
statAvgCommand   : STAT_AVG_TIME;
statMaxCommand   : STAT_MAX_TIME;

computationRequest: computationKind UNDER valuesKind SEMI_COLUMN variableValuesFunction SEMI_COLUMN expressions;
computationKind : MIN | MAX | AVG | COUNT;
valuesKind : GRID | LIST;

variableValuesFunction: variableValues (COMMA variableValues)*;
variableValues         : variable COLUMN variableLowerValue COLUMN variableStepValue COLUMN variableUpperValue;
variableLowerValue    : javaNumber;
variableStepValue     : javaNumber;
variableUpperValue    : javaNumber;

javaNumber : javaNumberSign? DIGIT+ ('.')? DIGIT* javaNumberExponential?
            | javaNumberSign? (DIGIT+ '.')? DIGIT+ javaNumberExponential?
            | javaNumberSign? DIGIT* '.' DIGIT+ javaNumberExponential?
            ;
javaNumberExponential : ('e' | 'E') javaNumberSign? DIGIT+;
javaNumberSign        : ('-' | '+');

expressions: expression (SEMI_COLUMN expression)*;

expression : variable
           | number
           | PAR_OPEN expression operator expression PAR_CLOSE;
operator   : OP_ADD | OP_MINUS | OP_MUL | OP_DIV | OP_POW;
variable   : LETTER (LETTER | DIGIT)*;
number     : DIGIT+ ('.' DIGIT+)?;

/**
 * Lexer rules
 */
BYE : B Y E;
STAT_REQS : S T A T '_' R E Q S;
STAT_AVG_TIME : S T A T '_' A V G '_' T I M E;
STAT_MAX_TIME : S T A T '_' M A X '_' T I M E;

GRID : G R I D;
LIST : L I S T;

MIN   : M I N;
MAX   : M A X;
AVG   : A V G;
COUNT : C O U N  T;

PAR_OPEN    : '(';
PAR_CLOSE   : ')';
// Math operators
OP_ADD      :   '+';
OP_MINUS    :   '-';
OP_MUL      :   '*';
OP_DIV      :   '/';
OP_POW      :   '^';

UNDER       : '_';
SEMI_COLUMN : ';';
COLUMN      : ':';
COMMA       : ',';

DIGIT: [0-9];
LETTER: [a-z];

fragment A : [A];
fragment B : [B];
fragment C : [C];
fragment D : [D];
fragment E : [E];
fragment F : [F];
fragment G : [G];
fragment H : [H];
fragment I : [I];
fragment J : [J];
fragment K : [K];
fragment L : [L];
fragment M : [M];
fragment N : [N];
fragment O : [O];
fragment P : [P];
fragment Q : [Q];
fragment R : [R];
fragment S : [S];
fragment T : [T];
fragment U : [U];
fragment V : [V];
fragment W : [W];
fragment X : [X];
fragment Y : [Y];
fragment Z : [Z];