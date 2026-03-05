tupla1 = (1,4,2,5,49,3,75,3)
tupla2 = (3,3,75,75,180,9,5)
tupla3 = (9,3,71,75,2,9)

conjunto = set()

for i in tupla1:
    if i not in tupla2 and i not in tupla3:
        conjunto.add(i)
for j in tupla2:
    if j not in tupla1 and j not in tupla3:
        conjunto.add(j)
for k in tupla3:
    if k not in tupla1 and k not in tupla2:
        conjunto.add(k)

print (conjunto)