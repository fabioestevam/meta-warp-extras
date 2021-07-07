SUMMARY = "An image with various examples and demos"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL_append_warp = " \
	kernel-modules u-boot-default-env libubootenv-bin \
	ca-certificates iw  \
	i2c-tools canutils systemd-conf openssl-engines rng-tools \
	devmem2 \
	"
