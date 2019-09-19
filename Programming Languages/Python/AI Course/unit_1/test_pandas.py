import os
import pandas as pd
from IPython.display import display #32

# Read a line of csv file
df = pd.read_csv("https://data.heatonresearch.com/data/t81-558/auto-mpg.csv")
display(df[0:5])

# Select only data types of type int and float in the file
df = df.select_dtypes(include=['int', 'float'])
#display(df[0:5])

# Get the headers of these values (columns)
headers = list(df.columns.values)
fields = []

# Get each column and calculates mean, var and sdev
for field in headers:
    # Add a dictionary 
    fields.append( {
        'name' : field,
        'mean' : df[field].mean(),
        'var' : df[field].var(), 
        'sdev' : df[field].std()
    })

for field in fields:
    display(field)

# Convert it to Data Frame object (pandas)
df2 = pd.DataFrame(fields)
display(df2)