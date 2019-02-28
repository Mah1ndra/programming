p = raw_input()
t = raw_input()
n1 = raw_input()
emi1=0
emi2=0
for i in n1:
    x=raw_input()
    emi1 =emi1 + p* x /( 1 - 1 / (1 + x)^(t * 12)) 

n2 = raw_input()
for i in n2:
    y=raw_input()
    emi2 =emi2 + p* y /( 1 - 1 / (1 + y)^(t * 12))

if (emi1<emi2):
    print "Bank A"
else:
    print "Bank B"
