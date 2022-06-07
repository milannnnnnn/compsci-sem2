from encryption_system import *;
import os

encrypt_sys = Encryption('TPoole22/000_Buffet/Python/000_Python/pkg')
print("Welcome to the encryption system.\n__________________________________ ")
#
while(1 > 0):
    #
    user_def = input("Would you like to encrypt a message, decrypt one,\nset a new directory, or stop the program?: ")
    print("__________________________________")
    
    if(user_def == "encrypt"):
        inMsg = input("Put the message you want to encrypt here: ")
        encrypt_sys.encrypt_msg(inMsg)
        del inMsg
        
    elif(user_def == "decrypt"):
        inKey = input("Put the key in here to decrypt the message: ")
        encrypt_sys.decrypt_msg(inKey)
        
    elif(user_def == "set new directory"):
        inDir = input("Put in your new directory: ")
        encrypt_sys.__init__(inDir)
        
    elif(user_def == "stop"):
        print("Closing program...")
        break
    
    else:
        print("Command not found. Try again.")
        
    print("__________________________________")