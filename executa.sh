#!/bin/bash

for  i in `seq 1 20` ; 
do
	time -a -o tempo.txt java -jar dist/SelectionSortEnergy.jar 1500 1 >> saídaSelectionVector.txt
done

for  i in `seq 1 20` ; 
do
	time -a -o tempo.txt java -jar dist/SelectionSortEnergy.jar 1500 2 >> saídaSelectionArrayList.txt
done

for  i in `seq 1 20` ; 
do
	time -a -o tempo.txt java -jar dist/SelectionSortEnergy.jar 1500 3 >> saídaSelectionLinkedLis.txt
done
