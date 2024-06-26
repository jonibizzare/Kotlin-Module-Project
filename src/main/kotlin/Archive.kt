class Archive (
    private var archiveName: String,
    private val archiveList: MutableList<Note>
) {
    init {
        val allArchivesMap: MutableMap<String, MutableList<Note>> = mutableMapOf()
            println("Введите название нового архива:")
            archiveName = UserInput().textInput()
            allArchivesMap.put(archiveName, archiveList)

            println("Архив с названием \"$archiveName\" создан " + archiveList)
            println("Текущий список ваших архивов $allArchivesMap")
        Menus().mainMenu()
    }
    constructor() : this("", mutableListOf())
    fun allArchives () {
        println(archiveList)
    }
}