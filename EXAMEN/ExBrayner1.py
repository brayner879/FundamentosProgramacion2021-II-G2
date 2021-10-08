print ( "Calcular Promedio final de FP" )
#Datos de Entrada
nota1 = int ( input ( "ingrese nota de evaluacion 1:" ))
nota2 = int ( input ( "ingrese nota de evaluacion 2:" ))
nota3 = int ( input ( "ingrese nota de evaluacion 3:" ))
#Prceso
proFin = ( 0.25 * nota1 ) + ( 0.25 * nota2 ) + ( 0.50 * nota3 )
#Datos de Salida
print ( type ( proFin ))
print ( "El promedio Final es:" , round ( proFin , 2 ))