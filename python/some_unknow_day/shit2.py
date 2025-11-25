# theere are 4 diff 

# open()
# filename, mode 
# "r" - read 
# "a" - append 
# "w" - write  -> creates the file if file doesnot exist 
# "x" - create  




# Read
f = open("example.txt", "r")
print(f)
# Append
f = open("example.txt", "a")

# Write (overwrites file, creates if missing)
f = open("example.txt", "w")

# Create (fails if file exists)
# f = open("example.txt", "x")

f.close()
# | Mode | Description                                                                                  |
# | ---- | -------------------------------------------------------------------------------------------- |
# | "r"  | Read (default). Opens file for reading. Fails if file does not exist.                        |
# | "a"  | Append. Opens file for writing, appending to the end. Creates the file if it does not exist. |
# | "w"  | Write. Opens file for writing;creates if it doesn't exist. Overwrites existing file.         |
# | "x"  | Create. Creates a new file. Fails if the file already exists.                                |



with open("example.txt", "r") as s:
    data = s.read()
    # Do stuff with data
    print(data)