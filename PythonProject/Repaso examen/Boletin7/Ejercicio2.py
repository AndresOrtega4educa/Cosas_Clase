tupla1 = (1,4,2,5,49,3,75,3)
tupla2 = (3,3,75,75,180,9,5)

conjunto = set()

for i in tupla1:
    if i not in tupla2:
           conjunto.add(i)
for j in tupla2:
    if j not in tupla1:
           conjunto.add(j)

print (conjunto)