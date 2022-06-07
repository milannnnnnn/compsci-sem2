from cryptography.fernet import Fernet
import os
import time

class Encryption:

        def __init__(self, my_directory):
                os.chdir('/home/ec2-user/environment')
                self.my_directory = my_directory
                #
                global user_directory
                user_directory = os.path.join(my_directory, 'user_directory.txt')
                #
                file = open(user_directory, "w")
                file.write(my_directory)
                file.close()
                #
                global genkey_path
                genkey_path = os.path.join(my_directory, "genkey.txt")
                
        def encrypt_msg(self, x): # where x = str input
                
                file = open(genkey_path, "w")
                file.write(Fernet.generate_key().decode())
                file.close()
                
                global f
                file = open(genkey_path, "r")
                f = Fernet(file.read())
                file.close()
                
                global token
                token = f.encrypt(b""+x.encode('ascii'))
                print("\nEncrypting message...\n")
                time.sleep(2)
                #
                print("Encrypted message: " +token.decode())
                print("\nKey is now set in genkey.txt. This will be able to decrypt\nyour currently encrypted message until another message\nis encrypted, in which a new key will be made instead.")
    
        def decrypt_msg(self, x): # where x = key
                file = open(genkey_path, "r")
                print("\nDecrypting message...\n")
                time.sleep(2)
                #
                if x == file.read():
                    d = f.decrypt(token)
                    print("Decrypted message: " +d.decode())
                else:
                    print("Decryption failed.")
            