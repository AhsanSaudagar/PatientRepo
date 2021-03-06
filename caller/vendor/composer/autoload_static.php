<?php

// autoload_static.php @generated by Composer

namespace Composer\Autoload;

class ComposerStaticInit3ca5f2c90e8d697f9720d9406bd4211b
{
    public static $prefixLengthsPsr4 = array (
        'T' => 
        array (
            'Twilio\\' => 7,
        ),
    );

    public static $prefixDirsPsr4 = array (
        'Twilio\\' => 
        array (
            0 => __DIR__ . '/..' . '/twilio/sdk/Twilio',
        ),
    );

    public static function getInitializer(ClassLoader $loader)
    {
        return \Closure::bind(function () use ($loader) {
            $loader->prefixLengthsPsr4 = ComposerStaticInit3ca5f2c90e8d697f9720d9406bd4211b::$prefixLengthsPsr4;
            $loader->prefixDirsPsr4 = ComposerStaticInit3ca5f2c90e8d697f9720d9406bd4211b::$prefixDirsPsr4;

        }, null, ClassLoader::class);
    }
}
