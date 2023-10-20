### Exercicis amb Collections

1. Crea un classe _**Llapis**_ com a mínim amb els atributs, _**color**(int)_ i _**gruix**(float)_, afegint-hi el comportament que creguis necessari (getters, setters, toString, etc.)  
_- Els colors van del 0 al 7 i el gruix de 0.1 a 3.0_  
2. Crea dues caixes de llapissos (amb List)  
3. Omple una caixa amb 10 llapisos de diferents colors (random)  
4. Omple l'altre caixa amb 10 llapissos amb diferents colors i de diferens gruixos (random)  
5. Imprimeix per la consola la informació dels llapissos que hi ha a les dues caixes. Usa recorreguts amb diferents tècniques (for, foreach. iterator, for loop)
6. Ordena els llapissos per color del més gran al més petit  
7. Ordena els llapissos per gruix amb una classe anònima i un Comparator  
8. Crea una LinkedList que contingui els llapissos de la caixa 2  
9. Afegeix també a aquesta LinkedList els llapissos de la caixa 1  
10. Imprimeix el contingut de la LinkedList  
11. Crea una altra caixa de llapissos amb els llapissos de la LinkedList però que no n'hi hagi de repetits a dins    
12. Crea el següent Map i observa el comportament del mètode put: 
    ``` java
    Map<Integer,String> map_colors = new HashMap<>();  
    //Afegim entrades al map
    map_colors.put(0,"Negre");
    map_colors.put(1,"Vermell");
    map_colors.put(2,"Groc");
    map_colors.put(3,"Verd");
    map_colors.put(4,"Verd");
    map_colors.put(3,"Blanc");
    ```
    1. Explica què passa amb el color verd i amb la clau 3. Perquè?  
    2. Imprimeix per pantalla, utilitzant un bucle for, tota la informació del Map (clau i valor)  
    3. Imprimeix per pantalla, utilitzant un bucle for, només els valors del Map    

13. Exercici de la freqüència de llançament de dos daus amb List i el mètode Collecions.frequency()
14. Exercici de la freqüència de llançament de dos daus amb Map
15. De l'exemple dels enums (Alumnes UF i Qualilfier) fes el següent:  
    - Omple una llista d'alumnes (3 alumnes)
    - Posa diverses notes a tots els alumnes (3 notes per alumne)
    - Treu el llistat de notes de cada un dels alumnes
    - Treu el llistat d'alumnes amb la seva nota mitja i en ordre alfabètic.
  
