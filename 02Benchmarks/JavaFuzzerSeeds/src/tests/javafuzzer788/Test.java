package tests.javafuzzer788;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 09:50:39 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=953717588242286199L;
    public double dFld=-1.40671;
    public static volatile byte byFld=-28;
    public short sArrFld[]=new short[N];
    public static byte byArrFld[][]=new byte[N][N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-24);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i9=-24718, i10=-17, i11=28687, i12=12, i13=9, i14=-48105, i15=-3, iArr[]=new int[N];
        byte by=-30, byArr[]=new byte[N];
        short s1=-22475;

        FuzzerUtils.init(byArr, (byte)-111);
        FuzzerUtils.init(iArr, 12218);

        byArr[(203 >>> 1) % N] = (byte)-241;
        Test.instanceCount -= i9;
        i9 -= (int)Test.instanceCount;
        Test.instanceCount = by;
        switch ((((242 >>> 1) % 4) * 5) + 44) {
        case 57:
            for (i10 = 11; 379 > i10; i10++) {
                i11 -= (int)42626L;
                for (i12 = 5; i12 > 1; i12 -= 2) {
                    i9 *= i11;
                    i9 = i13;
                    Test.instanceCount = -945502493L;
                    iArr[i10] &= i12;
                    for (i14 = 1; i14 < 3; ++i14) {
                        i13 = (int)1.158F;
                        i9 >>= i15;
                    }
                }
            }
            break;
        case 62:
            i13 = i14;
            break;
        case 51:
            i13 = (int)6643L;
            break;
        case 58:
            i9 *= s1;
            break;
        default:
            i11 /= (int)(Test.instanceCount | 1);
        }
        vMeth1_check_sum += i9 + by + i10 + i11 + i12 + i13 + i14 + i15 + s1 + FuzzerUtils.checkSum(byArr) +
            FuzzerUtils.checkSum(iArr);
    }

    public void vMeth(int i3, int i4) {

        int i5=-43975, i6=-50932, i7=-14, i8=38165, i16=8, iArr1[]=new int[N];
        short s=-12830;
        boolean b=false;
        float f=-1.598F, fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 0.510F);
        FuzzerUtils.init(iArr1, -5);

        for (i5 = 11; i5 < 347; ++i5) {
            s += (short)fArr1[i5 - 1];
            for (i7 = 1; i7 < 5; ++i7) {
                Test.instanceCount += (--i6);
                vMeth1();
                i8 = (int)-29373L;
                iArr1[i7 - 1] <<= i5;
                i16 = 1;
                do {
                    iArr1[i16] >>= (int)Test.instanceCount;
                    if (b) {
                        b = b;
                        i3 += (int)8L;
                        Test.instanceCount -= (long)dFld;
                        fArr1[i16] -= i4;
                    } else if (b) {
                        if (b) continue;
                    } else if (b) {
                        i6 += (((i16 * i6) + f) - s);
                    }
                } while (++i16 < 2);
            }
        }
        vMeth_check_sum += i3 + i4 + i5 + i6 + s + i7 + i8 + i16 + (b ? 1 : 0) + Float.floatToIntBits(f) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr1);
    }

    public float fMeth(long l, int i1, int i2) {

        int i17=-5, i18=46860, i19=-59000, i20=2, i21=49865, i22=180, i23=-151, iArr2[]=new int[N];
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(iArr2, 197);
        FuzzerUtils.init(byArr1, (byte)-2);

        vMeth(i2, i1);
        for (i17 = 196; i17 > 12; --i17) {
            i18 *= (int)l;
            Test.instanceCount += i2;
            switch ((i17 % 10) + 56) {
            case 56:
                i18 *= i2;
                for (i19 = 1; i19 < 9; i19++) {
                    for (i21 = 1; i21 < 2; ++i21) {
                        i2 += i21;
                        i2 |= -154;
                        i2 += i21;
                        i22 += -54276;
                        iArr2[i21] = 63;
                        l *= i1;
                        l += (((i21 * i22) + i22) - i1);
                    }
                }
                break;
            case 57:
                sArrFld[i17] <<= (short)i21;
                break;
            case 58:
                try {
                    i2 = (i23 / i2);
                    i18 = (164 / i1);
                    i2 = (i19 / -1619411533);
                } catch (ArithmeticException a_e) {}
                break;
            case 59:
                iArr2[i17] = (int)6999546052180379212L;
                break;
            case 60:
                i23 += i2;
            case 61:
                dFld += i2;
            case 62:
                i18 <<= 25017;
            case 63:
                i2 = (int)2.227F;
                break;
            case 64:
                i1 = (int)l;
                break;
            case 65:
                byArr1[i17] *= (byte)i21;
                break;
            }
        }
        long meth_res = l + i1 + i2 + i17 + i18 + i19 + i20 + i21 + i22 + i23 + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(byArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=22094, i25=12, i26=-2, i27=-1, i28=-10309, i29=13, iArr3[]=new int[N];
        short s2=19658;
        float f1=1.738F, fArr[]=new float[N];
        long l1=31332L;
        boolean b1=false;

        FuzzerUtils.init(fArr, 0.259F);
        FuzzerUtils.init(iArr3, -50354);

        fArr[(i >>> 1) % N] *= fMeth(-146L, i, i);
        Test.instanceCount = i;
        if (b1) {
            for (int i24 : iArr3) {
                i24 = i24;
                for (i25 = 3; 63 > i25; ++i25) {
                    iArr3 = iArr3;
                    for (i27 = i25; i27 < 2; i27++) {
                        Test.instanceCount = i27;
                        s2 += (short)141;
                        Test.instanceCount >>= Test.instanceCount;
                        Test.instanceCount = 40826;
                    }
                    i24 -= i24;
                    switch ((((i25 >>> 1) % 7) * 5) + 127) {
                    case 160:
                        Test.instanceCount += (i25 | i28);
                    case 143:
                        iArr3[i25 - 1] -= (int)Test.instanceCount;
                        Test.byArrFld[i25 + 1][i25] <<= (byte)-4;
                        f1 = (float)dFld;
                        break;
                    case 156:
                        i28 >>= i24;
                        for (l1 = 1; l1 < 2; l1++) {
                            iArr3[i25] -= Test.byFld;
                            if (b1) {
                                Test.instanceCount >>= Test.instanceCount;
                                i26 -= 62508;
                                i29 = (int)l1;
                            } else if (b1) {
                                f1 -= i;
                                i29 += (int)(l1 * l1);
                            }
                            i29 = i28;
                            f1 = Test.instanceCount;
                            Test.instanceCount = i27;
                        }
                    case 141:
                        i -= i26;
                    case 153:
                        i29 = (int)f1;
                    case 158:
                        Test.instanceCount += i25;
                        break;
                    case 157:
                        iArr3[i25 + 1] += (int)l1;
                        break;
                    }
                }
            }
        } else if (b1) {
            dFld = s2;
        } else if (b1) {
            Test.instanceCount |= -131;
        } else {
            iArr3[(241 >>> 1) % N] = (int)101.117045;
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
