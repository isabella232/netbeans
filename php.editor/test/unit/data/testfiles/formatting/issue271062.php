<?php
class ParentClass {
}

interface InterfaceA {
}

interface InterfaceB {
}

class Test {

public function test() {
$tmp = new class(0,   $a   ?   1   :   2  )  extends  ParentClass  implements  InterfaceA,  InterfaceB{
public function __construct($a, $b) {
}
};
$this->test();
}
}
