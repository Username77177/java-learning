# Script written by Username77177
import os

files_cson = os.listdir("./notes/")
for thisfile in files_cson:
    content = ""  # For content element in array
    title = ""  # For title element in array
    strlist = open("notes/" + thisfile, mode="r", errors='ignore') #encoding="UTF8")
    this_cson_strings = strlist.readlines()  # Read all strings in array

    for fastremove in this_cson_strings: # Remove "\n"
        this_cson_strings[this_cson_strings.index(fastremove)] = fastremove.replace('\n','')
    
    print("Checking the document and finding all tags\n")
    for string in this_cson_strings: # Find title, start point of content and endpoint of content block
        print(string)
        if "title:" in string:
            title = string.strip("title: ")
        elif "content: " in string:
            startc = this_cson_strings.index(string)
            continue
        elif "linesHighlighted:" in string: 
            stopc = this_cson_strings.index(string) - 1
            break
    
    print("\n\n")
    for elementindex in range(int(startc+1),int(stopc)):
        content+=this_cson_strings[elementindex]
        content+= "\n"
    strlist.close()
    print("Title: "+title.strip('"'))
    print("Content:")
    print(content)

    newfile = open("notes_md/"+title.strip('"')+".md", "w")
    newfile.write(content)
    newfile.close()