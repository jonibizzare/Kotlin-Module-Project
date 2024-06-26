class Menus {

    fun mainMenu() {
        println("Добро пожаловать в консольное приложение \"Заметки\".")
        while (true) {
            println("Главное Меню")
            println("Введите цифру для выбора действия:  \n 1. Создать архив. \n 2. Список текущих архивов. \n 3. Завершение работы")
            val sc = UserInput().menuInput()
            when (sc) {
                "1" -> Archive()
                "2" -> 123
                "3" -> break
            }
        }
    }
    fun createArchivesMenu () {
        while (true) {
            println("Меню Архивов")
            println("Введите цифру для выбора:  \n 1. Создать архив с заметками. \n 2. Открыть созданные архивы. \n 3. Завершение работы")
            val sc = UserInput().menuInput()
            when (sc) {
                //"1" -> Archives()
                "2" -> println("222")
                "3" -> println("333")
                "4" -> break
            }
        }
    }
}