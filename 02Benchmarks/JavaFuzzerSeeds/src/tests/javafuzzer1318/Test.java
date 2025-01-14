package tests.javafuzzer1318;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:10:40 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8715125942186427067L;
    public static double dFld=-1.101971;
    public static volatile int iFld=7;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i5) {

        double d1=26.60593;
        int i6=8;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-11138);

        for (d1 = 1; d1 < 141; d1++) {
            float f=-2.907F;
            sArr[(int)(d1)] = (short)i5;
            i5 = i6;
            f += (float)(((d1 * i6) + i6) - Test.instanceCount);
            i5 = i5;
        }
        long meth_res = i5 + Double.doubleToLongBits(d1) + i6 + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(int i2) {

        int i3=-62231, i4=18195, i7=-10, i8=-46004, i9=8281;
        double d=-48.41891;
        float f1=-1.713F, fArr[]=new float[N];
        byte by=127;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, -3712672015L);
        FuzzerUtils.init(fArr, 75.260F);

        i3 = 1;
        while (++i3 < 261) {
            i4 = 1;
            do {
                d = iMeth(i4);
                i2 += (i4 - i3);
                switch ((i3 % 2) + 22) {
                case 22:
                    i2 = i4;
                    i7 = 1;
                    while (++i7 < 1) {
                        i2 += (((i7 * i4) + f1) - by);
                    }
                    i2 = (int)d;
                    break;
                case 23:
                    switch (((i3 % 1) * 5) + 56) {
                    case 58:
                        for (i8 = 1; i8 < 1; i8++) {
                            Test.instanceCount >>= Test.instanceCount;
                        }
                        lArr[i3] = lArr[i4];
                        fArr[i4 + 1] = Test.instanceCount;
                        Test.instanceCount += (i4 | (long)f1);
                        break;
                    default:
                        i2 = i3;
                    }
                default:
                    i9 += (-54805 + (i4 * i4));
                }
            } while (++i4 < 6);
        }
        vMeth1_check_sum += i2 + i3 + i4 + Double.doubleToLongBits(d) + i7 + Float.floatToIntBits(f1) + by + i8 + i9 +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i, int i1, long l) {


        vMeth1(0);
        l -= (long)Test.dFld;
        vMeth_check_sum += i + i1 + l;
    }

    public void mainTest(String[] strArr1) {

        int i10=137, i11=-5582, i12=-22976, i13=-35976, i14=208, i15=-2026, iArr[]=new int[N], iArr1[]=new int[N];
        byte by1=-13;
        boolean b=false;
        float f2=2.448F;

        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(iArr1, 64);

        vMeth(i10, i10, Test.instanceCount);
        i10 &= i10;
        for (i11 = 7; i11 < 150; i11++) {
            iArr[i11 - 1] = (int)Test.instanceCount;
            i13 = 1;
            do {
                for (i14 = 1; i14 > i13; i14--) {
                    if (b) {
                    } else if (b) {
                        Test.instanceCount -= i13;
                        i15 = i13;
                        switch (((i14 % 8) * 5) + 74) {
                        case 78:
                            i15 = i14;
                            if (b) {
                                Test.dFld *= 2602;
                                Test.instanceCount = by1;
                            } else {
                                i12 += (((i14 * i15) + Test.instanceCount) - i14);
                            }
                            iArr[i13 - 1] += i10;
                            break;
                        case 80:
                            i10 += i13;
                            if (b) {
                                i12 -= -244;
                                if (b) continue;
                            } else if (b) {
                                switch ((i11 % 2) + 84) {
                                case 84:
                                    iArr1[i11] *= i15;
                                    i12 = i11;
                                case 85:
                                    i15 += i12;
                                    i10 += (10825 + (i14 * i14));
                                    f2 += -93.247F;
                                    Test.dFld += i10;
                                    break;
                                default:
                                    f2 += (i14 * i14);
                                    i15 *= i14;
                                    b = b;
                                }
                            } else {
                                i15 = (int)5034949487871756223L;
                            }
                            break;
                        case 87:
                            iArr = iArr1;
                            break;
                        case 88:
                            i10 = (int)Test.instanceCount;
                            break;
                        case 103:
                            i15 /= (int)((long)(Test.dFld) | 1);
                            break;
                        case 79:
                            i12 = -12;
                            break;
                        case 106:
                            iArr[i11 + 1] += (int)f2;
                            break;
                        case 102:
                            f2 += (i14 + f2);
                            break;
                        }
                    }
                }
            } while (++i13 < 175);
        }


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
