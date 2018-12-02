val inputFile = sc.textFile("data/hamlet.txt")
val topWordCount = inputFile.
   flatMap(str=>str.split(" ")).
   filter(!_.isEmpty).
   map(word=>(word,1)).
   reduceByKey(_+_).
   map{case (word, count) => (count, word)}.
   sortByKey(false)
   topWordCount.take(10).foreach(x=>println(x))
