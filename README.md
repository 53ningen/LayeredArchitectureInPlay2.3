### Play Framework 2.3.2でレイヤードアーキテクチャを強制する


ディレクトリ構造はこんな感じ

![](Structure.png)

applicationからはdomain, infrastructureが参照できる  
domainからはinfrastractureのみが参照できる  
infrastractureは上位のレイヤーにアクセスできない構造になっています．
