# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Streaming of OptiTrack mocap data to tf     <p>     This package contains a node that translates motion capture data from an     OptiTrack rig to tf transforms, poses and 2D poses. The node receives     packets that are streamed by a NatNet compliant source, decodes them and     broadcasts the poses of configured rigid bodies as tf transforms, poses,     and/or 2D poses.     </p>     <p>     Currently, this node supports the NatNet streaming protocol v3.0     </p>     <p>     Copyright (c) 2013, Clearpath Robotics<br/>      Copyright (c) 2010, University of Bonn, Computer Science Institute VI<br/>     All rights reserved.     </p>"
AUTHOR = "Tony Baltovski <tony@baltovski.ca>"
ROS_AUTHOR = "Kathrin Gräve <graeve@ais.uni-bonn.de>"
HOMEPAGE = "http://ros.org/wiki/mocap_optitrack"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=28;endline=28;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mocap_optitrack"
ROS_BPN = "mocap_optitrack"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    geometry-msgs \
    nav-msgs \
    roscpp \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    geometry-msgs \
    nav-msgs \
    roscpp \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    geometry-msgs \
    nav-msgs \
    roscpp \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers-gbp/mocap_optitrack-release/archive/release/noetic/mocap_optitrack/0.1.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/mocap_optitrack"
SRC_URI = "git://github.com/ros-drivers-gbp/mocap_optitrack-release;${ROS_BRANCH};protocol=https"
SRCREV = "8bcb6c4a0e43d2705452046266b275bdcba71bcd"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
