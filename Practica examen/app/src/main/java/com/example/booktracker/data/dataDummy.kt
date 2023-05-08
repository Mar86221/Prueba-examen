package com.example.booktracker.data
//declaraciones de las variables

//primer libro
val author1 = Author(
    firstName = "Jane",
    lastName = "Austen",
    birthDate = "16 December 1775",
    nationality = "British",
    bio = "Jane Austen was an English novelist known primarily for her six major novels, which interpret, critique and comment upon the British landed gentry at the end of the 18th century."
)
val publisher1 = Publisher(
    name = "Penguin Classics",
    location = "London, United Kingdom",
    website = "https://www.penguin.co.uk",
    foundingYear = 1935
)
val book1 = Book(
    title = "Pride and Prejudice",
    authors = listOf(author1),
    publisher = publisher1,
    publicationYear = "1813",
    pageCount = 279,
    subject = "Regency romance",
    summary = "Pride and Prejudice follows the lives of the Bennet family in early 19th-century England, focusing on the sisters' attempts to find love and marry well. It has become one of the most popular novels in English literature.",
    isbn = "9780141439518"
)

//segundo libro
val author2 = Author(
    firstName = "Gabriel",
    lastName = "García Márquez",
    birthDate = "6 March 1927",
    nationality = "Colombian",
    bio = "Gabriel García Márquez was a Colombian novelist, short-story writer, screenwriter and journalist, known affectionately as Gabo or Gabito throughout Latin America. He is considered one of the most significant authors of the 20th century."
)
val publisher2 = Publisher(
    name = "HarperCollins",
    location = "New York, United States",
    website = "https://www.harpercollins.com",
    foundingYear = 1989
)
val book2 = Book(
    title = "One Hundred Years of Solitude",
    authors = listOf(author2),
    publisher = publisher2,
    publicationYear = "1967",
    pageCount = 417,
    subject = "Magical realism",
    summary = "One Hundred Years of Solitude tells the story of the Buendía family and the fictional town of Macondo over the course of seven generations. It is widely considered to be one of the most influential works in the magical realism genre.",
    isbn = "9780060883287"
)

//tercer libro
val author3 = Author(
    firstName = "Stephen",
    lastName = "King",
    birthDate = "21 September 1947",
    nationality = "American",
    bio = "Stephen King is an American author of horror, supernatural fiction, suspense, and fantasy novels. He is considered one of the most successful and popular writers in the world."
)
val publisher3 = Publisher(
    name = "Scribner",
    location = "New York, United States",
    website = "https://www.simonandschuster.com/publishers/Scribner",
    foundingYear = 1846
)
val book3 = Book(
    title = "The Shining",
    authors = listOf(author3),
    publisher = publisher3,
    publicationYear = "1977",
    pageCount = 447,
    subject = "Horror",
    summary = "The Shining is a horror novel by Stephen King, about an aspiring writer and recovering alcoholic who accepts a position as the off-season caretaker of the historic Overlook Hotel in the Colorado Rockies. It has been adapted into a highly successful film and a television miniseries.",
    isbn = "9780385121675"
)

//cuarto libro
val author4 = Author(
    firstName = "J.K.",
    lastName = "Rowling",
    birthDate = "31 July 1965",
    nationality = "British",
    bio = "J.K. Rowling is a British author, philanthropist, film producer, television producer, and screenwriter. She is best known for writing the Harry Potter fantasy series, which has won multiple awards and sold more than 500 million copies, becoming the best-selling book series in history."
)
val publisher4 = Publisher(
    name = "Bloomsbury Publishing",
    location = "London, United Kingdom",
    website = "https://www.bloomsbury.com",
    foundingYear = 1986
)
val book4 = Book(
    title = "Harry Potter and the Philosopher's Stone",
    authors = listOf(author4),
    publisher = publisher4,
    publicationYear = "1997",
    pageCount = 223,
    subject = "Fantasy",
    summary = "Harry Potter and the Philosopher's Stone is the first novel in the Harry Potter series by J.K. Rowling. It follows the story of a young orphan boy named Harry Potter who discovers on his eleventh birthday that he is a wizard and is invited to attend Hogwarts School of Witchcraft and Wizardry.",
    isbn = "9780747532743"
)

//Quinto libro
val author5 = Author(
    firstName = "Dan",
    lastName = "Brown",
    birthDate = "22 June 1964",
    nationality = "American",
    bio = "Dan Brown is an American author known for his thriller novels, including the Robert Langdon stories: Angels & Demons, The Da Vinci Code, The Lost Symbol, Inferno and Origin."
)

val publisher5 = Publisher(
    name = "Doubleday",
    location = "New York, United States",
    website = "https://www.penguinrandomhouse.com/publishers/doubleday/",
    foundingYear = 1897
)

val book5 = Book(
    title = "The Da Vinci Code",
    authors = listOf(author5),
    publisher = publisher5,
    publicationYear = "2003",
    pageCount = 489,
    subject = "Thriller",
    summary = "The Da Vinci Code is a thriller novel by Dan Brown. It follows symbologist Robert Langdon and cryptologist Sophie Neveu after a murder in the Louvre Museum in Paris, where they discover a series of clues and puzzles that lead them to uncover a religious conspiracy.",
    isbn = "9780385504201"
)

//Sexto libro
val author6 = Author(
    firstName = "Harper",
    lastName = "Lee",
    birthDate = "28 April 1926",
    nationality = "American",
    bio = "Harper Lee was an American novelist known for her novel To Kill a Mockingbird, which won the Pulitzer Prize in 1961. She was also awarded the Presidential Medal of Freedom in 2007 for her contribution to literature."
)

val publisher6 = Publisher(
    name = "J.B. Lippincott & Co.",
    location = "Philadelphia, United States",
    website = "https://en.wikipedia.org/wiki/J._B._Lippincott_%26_Co.",
    foundingYear = 1836
)

val book6 = Book(
    title = "To Kill a Mockingbird",
    authors = listOf(author6),
    publisher = publisher6,
    publicationYear = "1960",
    pageCount = 281,
    subject = "Fiction",
    summary = "To Kill a Mockingbird is a novel by Harper Lee. It is set in the Deep South and is a coming-of-age story about a young girl named Scout Finch and her experiences with racism and injustice in her community. It is widely regarded as a classic of modern American literature.",
    isbn = "9780446310789"
)

public val books = listOf(book1, book2, book3, book4, book5, book6)
public val publishers = listOf(publisher1, publisher2, publisher3, publisher4, publisher5, publisher6)
public val authors = listOf(author1, author2, author3, author4, author5, author6)