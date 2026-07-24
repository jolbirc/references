# ENCRYPTION

---

## GNU Privacy Guard
Encrypton: `gpg --symmetric --cipher-algo [CIPHER] message.txt`
Decryption: `gpg --output original_message.txt --decrypt message.gpg`
ASCII armored output: `gpg --armor --symetric --cipher-algo [CIPHER] message.txt`

## OpenSSL Project
Encyrption: `openssl aes-256-cbc -e -in message.txt -out encrypted_message`
Decryption: `opensl aes-256-cbc -d -in encrypted_message -out original_message.txt`
To add resilience (Password-Based Key Derivation Function 2): `-pbkdf2`
To add iterations: `-iter`
Generating a certificate signing request: `openssl req -new -nodes -newkey rsa:4096 -keyout key.pm -out cert.csr`
