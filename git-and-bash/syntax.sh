#!/bin/bash
# Print
echo "Hey, what's your name?"
read name
echo "Welcome, $name"

# Comments
# See above lol

# Loop
for i in {1..10}
do
echo $i
done

# Conditionals
echo "Please enter your name first: "
read name
if [ "$name" = "Josh" ]; then
    echo "Welcome, $name"
else
    echo "Sorry, $name is not recognized"
fi
