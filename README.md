# doma-with-quarkus-demo project

うまくいかん！！！

- https://quarkus.io/blog/quarkus-dependency-injection/#simplified-constructor-injection

Client proxyを作るために引数なしコンストラクタが必要、と。なるほど。

---

`XxxDaoImpl`は`AbstractDao`を継承しているが`AbstractDao`が引数なしコンストラクタを持っていないためエラーになる。

Doma側で対応して頂いて`AbstractDao`が引数なしコンストラクタを持った。
が、エラーになる。

`./foo`と`src/main/java/com/example/{Bar.java,Baz.java,Hoge.java}`で試してみた。

- 親クラスが`src/main/java`にある場合、親クラスが引数なしコンストラクタを持っていれば子クラスは引数なしコンストラクタを持っていなくてもOK
- 親クラスが依存JARに入っている場合、親クラスが引数なしコンストラクタを持っていても子クラスが引数なしコンストラクタを持っていないとエラー
- 親クラスが依存JARに入っている場合、そのまま継承するのではなく引数なしコンストラクタを持つクラスを`src/main/java`以下に作ってそれを経由すればOK（`Hoge.java`を参照）

試す場合はまず`./foo`をローカルリポジトリにインストールすること。

```
cd foo
mvn install
```

