package chapter4

class User1(val nickname: String,
           val isSubscribed: Boolean = true)

class User2(_nickname: String,
            _isSubscribed: Boolean) {
    val nickname = _nickname
    val isSubscribed = _isSubscribed
}

class User3 constructor(_nickname: String,
                        _isSubscribed: Boolean) {
    val nickname = _nickname
    val isSubscribed = _isSubscribed
}

class User4(_nickname: String,
            _isSubscribed: Boolean) {
    val nickname: String
    val isSubscribed: Boolean

    init {
        nickname = _nickname
        isSubscribed = _isSubscribed
    }
}