WinWaitActive("Windows Security")
sleep(1000)
ControlSetText("Windows Security","","Edit1","hello123")
Sleep(1000)
ControlSetText("Windows Security","","Edit2","hello123")
Sleep(1000)
ControlClick("Windows Security","","Button2")