require ${COREBASE}/meta/recipes-graphics/images/core-image-weston.bb

SUMMARY = "The ROS desktop full image."
DESCRIPTION = "${SUMMARY}"

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_DISTRO_TYPE}_image

IMAGE_INSTALL:append = " \
    ros-core \
    desktop-full \
"
