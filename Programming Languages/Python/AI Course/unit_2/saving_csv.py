import os
import pandas as pd
import numpy as np
from IPython.display import display

path = "C:\\Users\\efren\\github\\Lars17S\\Programming Languages\\Python\\AI Course\\unit_2" # string

df = pd.read_csv("https://data.heatonresearch.com/data/t81-558/auto-mpg.csv", na_values=['NA', '?'])

filename_write = os.path.join(path, "auto-mpg-shuffle.csv")
display(df[0:10])
df = df.reindex(np.random.permutation(df.index))
display(df[0:10])
#index false tells not to put a row number on each row
df.to_csv(filename_write, index = False)

# You might wish to only convert some of the columns
# df[['mpg', 'cylinders', 'displacement', 'horsepower', 'weight', 'acceleration', 'year', 'origin']].values