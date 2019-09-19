c = ['a', 'b', 'c', 'd']
for s in c:
    print(s)

l = []
l.append('a')
l.append('b')
l.append('c')
l.append('d')

for i,l in enumerate(l):
    print(f"{i}:{l}")

d = set()
d.add('a')
d.add('b')
d.add('c')
d.add('c')
print(d)