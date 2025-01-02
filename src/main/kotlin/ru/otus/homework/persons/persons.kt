package ru.otus.homework.persons

/**
 * Отсортировать список персон по возрасту в порядке убывания
 */
fun List<Person>.getSortByAge(): List<Person> {
    return this.sortedByDescending { it.age }
}

/**
 * Отсортировать список персон по фамилии
 * - Фамилии сортируются по алфавиту в порядке возрастания
 * - Если фамилии совпадают, персоны сортируются по имени в порядке возрастания
 */
fun List<Person>.sortByName(): List<Person> {
    return sortedWith(compareBy(
        { it.surname },
        { it.name }
    ))
}