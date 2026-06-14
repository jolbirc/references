p = 29
g = 5
a = 12
b = 17

A = (g**a) % p
B = (g**b) % p

bob_key = (B**a) % p
alice_key = (A**b) % p

print(f"Bobs key: {bob_key}")
print(f"Alices key: {alice_key}")
