import os
import pandas as pd
import numpy as np
from IPython.display import display

df = pd.read_csv("https://data.heatonresearch.com/data/t81-558/auto-mpg.csv", na_values=['NA', '?'])

# Randomly permute a sequence of rows
# Usually a good idea
df = df.reindex(np.random.permutation(df.index))
display(df[0:10])

# It is a list of trues and falses with length df, in average it takes
# 80% Trues 
mask = np.random.rand(len(df)) < 0.8 #Mask is type numpy.ndarray

# You can pass a list as argument df_temp[[True, True, False, False, True]]
trainDF = pd.DataFrame(df[mask])
# See https://data-flair.training/blogs/python-bitwise-operators/ for bitwise operators
# Bitwise 1's Complement
# In this case, it represents the opposite mask. Negates each value
# It is the "invert" or "complement" operation, in which all the bits of the input data are reversed.
validationDF = pd.DataFrame(df[~mask])

print(f"Training DF: {len(trainDF)}")
print(f"Validation DF: {len(validationDF)}")

# NN requires a numerical matrix

matrix_df = df.values