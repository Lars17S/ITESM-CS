import os
import pandas as pd
import numpy as np
from IPython.display import display

df = pd.read_csv("https://data.heatonresearch.com/data/t81-558/auto-mpg.csv", na_values=['NA', '?'])

# You can get unique shuffle types each time
# np.random.seed(42) 

df = df.reindex(np.random.permutation(df.index))
# Sort again just the index column in increasing order
df.reset_index(inplace = True, drop = True)
display(df[0:10])

ds = pd.read_csv("https://data.heatonresearch.com/data/t81-558/auto-mpg.csv", na_values=['NA', '?'])
ds = ds.sort_values(by = 'name', ascending = True)
print(f"The first car is: {ds['name'].iloc[0]}")
ds.reset_index(inplace = True, drop = True)
display(ds[0:5])

#Grouping data

dt = pd.read_csv("https://data.heatonresearch.com/data/t81-558/auto-mpg.csv", na_values=['NA', '?'])
g = dt.groupby('cylinders')['mpg'].mean()
print(g)
d = g.to_dict()
print(d)
print(df.groupby('cylinders')['mpg'].count().to_dict())