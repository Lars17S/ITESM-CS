import os
import pandas as pd 
import numpy as np 
from IPython.display import display

df = pd.read_csv("https://data.heatonresearch.com/data/t81-558/auto-mpg.csv", na_values=['NA', '?'])
display(df[0:10])
df['origin_name'] = df['origin'].map({1: 'North America', 2: 'Europe', 3: 'Asia'})
display(df[0:20])

# Apply function is directly executed on the data frame.
# lambda function

# Pandas apply allow the users to pass a function and apply it on every single value of the Pandas series

effi = df.apply(lambda x: x['displacement']/x['horsepower'], axis = 1)
display(effi[0:10])

