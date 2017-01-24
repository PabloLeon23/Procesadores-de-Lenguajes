f = open('cup_done.cup')
fo = open('cup_done2.cup', 'w')

for line in f.readlines():
    line = line.lstrip()
    fo.write(line)
