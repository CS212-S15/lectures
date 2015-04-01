TF-IDF Scoring
==============

Term Frequency-Inverse Document Frequency (TF-IDF) is a measure used to determine how important a word is in a *collection* of documents.

Suppose you have 1,000 documents and 100 of them contain the word "computer". When you search for "computer" in this *corpus* (i.e., collection of documents), you will still get 100 results. Now, suppose your *query*, "computer", appears only one time in the first 99 documents and 500 times in the 100th document. Which document should appear first in your results? 

TF-IDF is a way of computing a score for each document such that the more *relevant* documents have a higher score, thus could be shown first in the list of results.

#Term Frequency
The term frequency is just what it sounds like. It is the number of times that the word appears in the document.

Consider the following example:

```
doc1: 'the dog ran and the dog jumped'
doc2: 'the dog ran and the cat ate'
doc3: 'the dog ran and the dog barked but the fox slept and the bird ate'
```

If I search for "dog", which is the most relevant document?

Arguably, doc1 is the most relevant because it is only about dogs. doc2 is about both dogs and cats, and though doc3 refers to dogs as often as doc1, it also refers to foxes. To integrate this logic, TF is often normalized, so it becomes the percentage of words in the document that match the query term.

```
Term Frequency(word, document) = number of occurrences of word in document / 
										total number of words in document
```

```
tf('dog', doc1) = 2 / 7  = .286
tf('dog', doc2) = 1 / 7  = .143 
tf('dog', doc3) = 2 / 15 = .133
```

#Inverse Document Frequency
The inverse document frequency provides a measure of whether a word is common or rare across the corpus. 

```
Inverse Document Frequency (word) = log(total number of documents / 
												documents containing word)
```

```
idf('dog') = log (3 / 3) = 0
idf('fox') = log (3 / 1) = .477
idf('ate') = log (3 / 2) = .176
```

#TF-IDF
The tf-idf score is the product of the TF and the IDF. 

```
tfidf('dog', doc1) = .286 * 0 = 0
tfidf('dog', doc2) = .143 * 0 = 0
tfidf('dog', doc3) = .133 * 0 = 0
```

Because "dog" is so common, the IDF measure tells us that all documents are equally relevant (or, not relevant in this case). Note that this would also be the case for a word like "the".

The tf-idf score of a multi-word query is the sum of the tf-idf scores of each individual word. 

```
tfidf('fox', doc1) = 0 * .477 = 0
tfidf('fox', doc2) = 0 * .477 = 0
tfidf('fox', doc3) = .067 * .477 = .032

tfidf('ate', doc1) = 0 * .176 = 0
tfidf('ate', doc2) = .143 * .176 = .025
tfidf('ate', doc3) = .067 * .176 = .012
```

Note that although "fox" and "ate" appear the same number of times in doc3, "ate" has a lower score since it appears more frequently across the corpus.

```
tfidf('fox ate', doc1) = 0 + 0 = 0
tfidf('fox ate', doc2) = 0 + .025 = .025
tfidf('fox ate', doc3) = .032 + .012 = .044
```



